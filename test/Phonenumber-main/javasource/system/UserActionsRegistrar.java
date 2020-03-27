package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(googlephonelib.actions.isNumberMatch.class);
    registrator.registerUserAction(googlephonelib.actions.ParsePhonenumber.class);
    registrator.registerUserAction(googlephonelib.actions.PhonenumberPossible.class);
    registrator.registerUserAction(googlephonelib.actions.PhonenumberValid.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
