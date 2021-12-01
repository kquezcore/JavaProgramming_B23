package Day60_Fuctional_Interface;

@FunctionalInterface
public interface DataFunction<T> { // generic type

    T accept(T t);


}