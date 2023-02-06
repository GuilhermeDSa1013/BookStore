package TelasUtil;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitaCaracteres extends PlainDocument {
    
    public enum TipoEntrada{
        NOME, ENDERECO, CPF, TELEFONE, EMAIL, SENHA, TITULO, AUTOR, EDITORA, DESCRICAO, VALOR
    };
    
    private int qtdCaracteres;
    private TipoEntrada tpEntrada;

    public LimitaCaracteres(int qtdCaracteres, TipoEntrada tpEntrada) {
        this.qtdCaracteres = qtdCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str == null || getLength() == qtdCaracteres){
            return;
        }
        int totalCarac = getLength() + str.length();
        
        //Filtro de caracteres
        String regex = "";
        switch(tpEntrada){
            case NOME: regex = "[^\\p{IsLatin} ]";break;
            case ENDERECO: regex = "[^\\p{IsLatin} @.\\-_][^0-9]]";break;
            case CPF: regex = "[^0-9]";break;
            case TELEFONE:  regex = "[^0-9]";break;
            case EMAIL: regex = "[^\\p{IsLatin}@.\\-_][^0-9]";break;
            case SENHA: regex = "[^\\p{IsLatin}@.\\-_][^0-9]";break;
            case TITULO: regex = "[^\\p{IsLatin} ,.:\\-_][^0-9]";break;
            case AUTOR: regex = "[^\\p{IsLatin} ]";break;
            case EDITORA: regex = "[^\\p{IsLatin} ,.\\-_][^0-9]";break;
            case DESCRICAO: regex = "[^\\p{IsLatin} ,.\\-_][^0-9]";break;
            case VALOR: regex = "[^0-9.]";break;
        }
        //Fazendo a substituição
        str = str.replaceAll(regex, "");
        
        if (totalCarac <= qtdCaracteres){
             super.insertString(offs, str, a);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }else{
            String nova = str.substring(0, qtdCaracteres);
            super.insertString(offs, nova, a);
        }
    }
    
    
    
}
