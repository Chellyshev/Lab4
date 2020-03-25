public class ViewException extends RuntimeException {
    public ViewException()
    {
        super("Персонажи не могут смотреть так далеко! View должно быть не больше 25!");
    }
}
