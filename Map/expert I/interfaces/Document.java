package interfaces;

import java.util.UUID;

public abstract class Document {
    private final UUID id;

    public Document(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return this.id;
    }

}
