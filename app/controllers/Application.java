package controllers;

import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result ping(){
        Logger.debug("ping");
        return ok(Json.newObject().put("result","pong"));
    }

}
