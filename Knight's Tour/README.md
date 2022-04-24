CAMPINA GRANDE, 25 DE AGOSTO DE 2021

# Knight's Tour Problem

## Resumo
O algoritmo criado para a solução do problema “Knight’s Tour” que utiliza a regra de Warnsdorff
para determinar qual é o melhor caminho a ser seguido e o faz de maneira recursiva, para minimizar
a repetição resultados impressos é utilizado uma proposição baseada na feita por Arnd Roth.

## Primeira Tentativa: Força Bruta.
Foi criado um array 8x8 preenchido com “0” para representar o tabuleiro, é dado uma casa inicial
de onde o cavalo parte e cada casa visitada por ele é preenchida pelo valor atual da variável
“moveCount” que, por sua vez, é incrementada a cada nova chamada da função “knightMove()” e
decrementada no fim da mesma caso se encontre em uma posição sem movimentos válidos que não
seja de número 64.

Na função “knightMove()” todos os movimentos possíveis de serem realizados pelo cavalo a
partir da casa atual são salvos em um array que é percorrido, caso o movimento em questão resulte
não extrapole o tabuleiro e leve a uma casa não visitada a função “knightMove()” é chamada
novamente. Para determinar se uma posição extrapola os limites do tabuleiro ou não, primeiro foi
utilizado uma série de ‘ifs”, que de fato solucionam o problema, porém é uma solução verborrágica
e aparenta desperdiçar poder computacional. Foi realizada uma pergunta no stackoverflow e a
alternativa indicada é utilizar uma classe para gerenciar as coordenadas do tabuleiro de modo que se
é possível efetuar operações com essas coordenadas e depois checar se elas ainda pertencem ao
tabuleiro (Blanc, 2021).

A ideia do uso da recursão é que caso o algoritmo chegue em uma posição sem movimentos
válidos ele possa “voltar o caminho” e tentar seguir por caminhos diferentes até chegar em uma
solução válida para o problema, sempre que ele vai regressando no caminho as casas por onde ele
passa são redefinidas como “0” para não interferir na lógica da movimentação do cavalo. No
momento os movimentos possíveis de serem realizados a partir da casa atual são salvos
sequencialmente, dessa forma o algoritmo é capaz de encontrar apenas uma solução para cada ponto
de partida do cavalo. Visando solucionar o problema foi criado uma função chamada “sortArray()”
que recebe um array e retorna ele embaralhado, essa função foi utilizada para embaralhar o array de
movimentos válidos, solucionando o problema de resultados estáticos para o problema, porém esse
método revelou uma falha crítica nessa abordagem ao problema.

Agora o algoritmo aleatoriamente escolhe um movimento a ser feito, por não haver nenhum
rigor a grande maioria das vezes ele acaba em um beco sem saída e a recursão o faz regressar até
que ele encontre um caminho ainda não tentado (continuando de percorrer os arrays de movimentos
válidos salvos anteriormente), porém por ser uma decisão aleatória isso o acaba a novos caminhos
errados cada qual com sua própria ramificação, o algoritmo se demonstra incapaz de identificar
erros feitos na origem (nos primeiros movimentos) e segue criando novas possibilidades encima do
erro, o que o leva a criar novas possibilidades e repetir o processo em um ciclo sem fim. Uma boa
maneira de pensar nesse problema é como uma árvore de grafos em que um de ramos continua a se
destruir e se regenerar infinitamente sem jamais chegar ao tronco ou à raiz da árvore. Para que esse
algoritmo encontre uma solução válida para o problema ele precisaria aleatoriamente escolher 40 ou
50 casas corretas para só então ele ser capaz de resolver os erros posteriores e encontrar o melhor
caminho.

## Segunda Tentativa: Regra de Warnsdorff.
Nesse ponto foi realizada uma pesquisa na internet em busca de maneiras de abordar o problema, o
algoritmo precisava seguir algum procedimento lógico para encontrar uma solução. Foi optado pela
implementação da regra de Warnsdorff, na qual cada movimento válido é ranqueado pelo número
de movimentos válidos disponível a partir da nova posição. Quando se conta a quantidade de
movimentos válidos não é considerado casas já visitadas, o movimento que tiver o menor número
de movimentos válidos é escolhido (Wikipedia, 2021).

Foi criado uma função chamada “rateMove()” que é responsável por ranquear uma
coordenada e salvar esse valor na mesma. Não há mais sentido em embaralhar os movimentos
válidos, então o método “shuffleArray()” foi substituído pelas funções “sortArray()”, que ordena o
array de movimentos válidos de forma crescente baseado no valor de ranqueamento de cada
coordenada, e “removeArrayElement()” que é utilizado dentro da lógica do “sortArray()”.
A regra de Warnsdorff é uma heurística que sempre encontra a mesma solução para esse
problema, os resultados sempre são corretos e sempre são os mesmos, de forma que já não faz
sentido utilizar recursão dado que o único beco sem saída encontrado é a solução correta para o
problema.

## Terceira Tentativa: Proposição de Arnd Roth.
Para solucionar a arbitrariedade do algoritmo de Warnsdorff, o pesquisador Arnd Roth propõe que
quando houverem empates de ranqueamento das posições é necessário utilizar um critério aleatório
de desempate (Roth, 1999), no exemplo que Roth mostra é utilizado um critério de desempate no
qual a posição com a maior distância euclidiana do centro do tabuleiro.

No caso aqui exemplificado logo após de reordenar o array de posições válidas é gerado um
número aleatório entre 0-10 que é salvo dentro variável n que é utilizado em um “switch case”. A
estrutura condicional do “switch case” foi optada em detrimento da escolha do “if/else” pois nela
não é feito uma checagem do valor condicional e sim um endereçamento, o que é mais performático
em relação ao “if/else”. Caso a variável ‘n’ possua o valor ‘2’, que resulta em uma chance 1/11, o
array de posições válidas é embaralhado, caso a variável ‘n’ possua qualquer outro valor nada é
alterado no array e a regra de Warnsdorff é utilizada.

Dessa forma o algoritmo pode ou não utilizar a regra de Warnsdorff o que resulta na geração
de soluções diferentes para o problema, algumas corretas e outras não. Quanto menor for a
probabilidade de ‘n’ ser igual a 2, maior será a chance de vir uma solução correta e que essa solução
correta seja semelhante a outras já apresentadas. Agora a recursividade volta a ter utilidade, caso o
algoritmo se encontre em um beco sem saída devido ao não uso da regra de Warnsdorff, ele
consegue regressar e buscar um novo caminho até que se esgotem as possibilidades.

## Conclusão
Existem diversas maneiras de calcular caminhos em grafos, e em particular no problema do Passeio
do Cavalo existem diversas soluções e regras que podem ser aplicadas para resultar em trajetos
diferentes. Visando melhorar o código atual, seria ideal conseguir separar e gerar passeios fechados
e abertos.
Uma abordagem não tentada seria gerar caminhos via força bruta e salvar metadados desses
caminhos feitos de modo que os metadados salvos influenciem na geração dos próximos caminhos,
então dependendo da extração, relevância e utilização desses metadados o programa seria capaz de
aumentar a proporção de soluções corretas geradas conforme o número de caminhos
(gerações/tentativas) gerados pelo algoritmo aumenta.

## Referências
BLANC, Gilbert Le. Java – How to avoid accessing an invalid position in a 2d array?, 2021.
Disponível em: <https://stackoverflow.com/questions/68977001/java-how-to-avoid-accessing-aninvalid-position-in-a-2d-array>. Acesso em: 31 de ago. De 2021;

CHESS.COM. Knight’s Tour, 2021. Disponível em: <https://www.chess.com/terms/knights-tourchess#:~:text=The%20knight's%20tour%20is%20a,same%20square%20more%20than%20once.>.
Acesso em: 31 de ago. De 2021;

ROTH, Arnd. The Problem of the Knight: A Fast and Simple Algorithm, 1999. Max-PlanckInstitut für Medizinische Forschung. Disponível em:
<https://www.wolframcloud.com/objects/nbarch/2018/10/2018-10-10r6l3m/Knight.nb>

WIKIPEDIA, the free encyclopedia. Knight’s Tour, 2021. Disponível em:
<https://en.wikipedia.org/wiki/Knight%27s_tour>. Acesso em: 31 de ago. De 2021;
