package classessintaticas;

public class Semantico implements Constants
{
    public void executeAction(int action, Token token)	throws SemanticError
    {
        System.out.println("Acão #"+action+", Token: "+token);
    }	
}
