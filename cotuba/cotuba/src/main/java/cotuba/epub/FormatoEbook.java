package cotuba.epub;

import cotuba.domain.Ebook;

import java.nio.file.Path;

public interface FormatoEbook {
    void gera(Ebook ebook, Path arquivoDeSaida);
}