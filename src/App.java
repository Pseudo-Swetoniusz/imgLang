import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

    public App() {

    }

    public void runApp(String file) throws IOException,FileNotFoundException {
        ANTLRInputStream input = new ANTLRFileStream(file);
        ImgLangLexer lexer = new ImgLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ImgLangParser parser = new ImgLangParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        ImageListener listener = new ImageListener();
        walker.walk(listener,parser.imgBlock());

    }
}
