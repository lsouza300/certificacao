package br.com.cert5;

public class HierarquiaExcecoes {

	String s;
	

	/**
	 * 		 HIERARQUIA DE EXCEÇÕES
	 *  
	 * 
	 *                Object
	 *              	|
	 *                  |
	 *              Throwable
	 *            /           \
	 *          /               \
	 *      Error              Exception
	 *      /                    /       \
	 *    /                    /           \
	 *  ...          RuntimeException        ...
	 * 
	 * - Todas as classes Exceptions s�o derivadas de java.lang.Exception
	 * - Erros nao sao excecoes e nao derivam da classe Exception
	 * - Exception, Error, Throwable e RuntimeException podem ser lancados com throw
	 * 
	 */
	static void hierarquiaException(){
		try {
			go();
		}
		catch (ExceptionB e){
			e.printStackTrace();
		}
		catch (ExceptionA e){
			e.printStackTrace();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	static void go() throws Exception{
		throw new ExceptionA();
	}
}


class ExceptionA extends Exception {
	ExceptionA(){}
}

class ExceptionB extends ExceptionA{

}