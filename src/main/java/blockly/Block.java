package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Block {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Block
	public static Var Execute() throws Exception {
		return new Callable<Var>() {

			private Var item = Var.VAR_NULL;

			public Var call() throws Exception {
				item = Var.valueOf("Usuario teste");
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
						item);
				return Var.VAR_NULL;
			}
		}.call();
	}

}
