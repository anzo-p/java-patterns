package others.mvc;

/*
    MVC
    - Model only knows about its values, the data, ist validations, and its internal computations, model creations...
    - View only knows about representing some data, but it doesn't know what data, it doesnt know the models
    - Controller doesn't know how top calculate or represent the data but it knows the model and view and their external API

    In WebbApps
    - Model is the backend model that goes into persistence
    - View is the render in frontend
    - Controller processes web requests, it knows the model and some service class that knows the rest
 */

public class Runner {

    public static void main(String[] args) {

        Model model = new Model();

        View view = new View();

        Controller controller = new Controller(model, view);

        view.setVisible(true);
    }
}