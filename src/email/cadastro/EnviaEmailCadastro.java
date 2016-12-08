package email.cadastro;

/**
 *
 * @author matheush
 */
public interface EnviaEmailCadastro {
    public String geraCodConfirmacao();
    public boolean EnviarEmail(String emailCadastro, String codConfirmacao);
    public boolean EnviarCodConfirmacao(String codigo, String emailCadastro);
    
}
