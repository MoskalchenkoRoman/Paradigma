package dz3.t3;
import java.io.Serializable;

public final class Logger implements Serializable{
    private static final long serialVersionUID = 1L;

    // INSTANCE должен быть статическим и окончательным, чтобы предотвратить последующую модификацию
    private static Logger INSTANCE;

    // Конструктор должен быть закрытым, чтобы предотвратить появление другого экземпляра класса.
    private Logger()
    {
        if (INSTANCE != null) {
            throw new IllegalStateException();
        }
    }

    // Общедоступный статический метод каждый раз возвращает ссылку на один и тот же объект
    public static Logger getInstance()
    {
        synchronized (Logger.class)
        {
            if (INSTANCE == null) {
                INSTANCE = new Logger();
            }
        }
        return INSTANCE;
    }

    // метод readResolve для сохранения одноэлементного свойства
    private Object readResolve()
    {
        // Возвращаем единственный истинный синглтон и позволяем сборщику мусора
        // позаботимся об имперсонаторе синглтона.
        return INSTANCE;
    }
}
