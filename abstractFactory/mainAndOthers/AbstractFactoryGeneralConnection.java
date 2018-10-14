package mainAndOthers;

public interface AbstractFactoryGeneralConnection{

	GeneralConnection getBD(String plataforma);
	GeneralConnectionREST getREST(String url);

}