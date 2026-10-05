# 05_figures

Иерархия фигур на Kotlin: абстрактный класс `Figure`, интерфейсы `Movable` и `Transforming`, классы `Rect`, `Circle`, `Square`.

## Main

```kotlin
fun main() {
    val rect = Rect(2, 1, 4, 2)
    println("Rect до: x=${rect.x}, y=${rect.y}, width=${rect.width}, height=${rect.height}, area=${rect.area()}")
    rect.move(1, 1)
    rect.resize(2)
    rect.rotate(RotateDirection.Clockwise, 0, 0)
    println("Rect после: x=${rect.x}, y=${rect.y}, width=${rect.width}, height=${rect.height}, area=${rect.area()}")

    val circle = Circle(2, 1, 2)
    println("Circle до: x=${circle.x}, y=${circle.y}, radius=${circle.radius}, area=${circle.area()}")
    circle.move(1, 1)
    circle.resize(2)
    circle.rotate(RotateDirection.Clockwise, 0, 0)
    println("Circle после: x=${circle.x}, y=${circle.y}, radius=${circle.radius}, area=${circle.area()}")

    val square = Square(2, 1, 3)
    println("Square до: x=${square.x}, y=${square.y}, side=${square.side}, area=${square.area()}")
    square.move(1, 1)
    square.resize(2)
    square.rotate(RotateDirection.Clockwise, 0, 0)
    println("Square после: x=${square.x}, y=${square.y}, side=${square.side}, area=${square.area()}")
}
```

## Вывод программы

```
Rect до: x=2, y=1, width=4, height=2, area=8.0
Rect после: x=-6, y=3, width=4, height=8, area=32.0
Circle до: x=2, y=1, radius=2, area=12.566371
Circle после: x=-2, y=3, radius=4, area=50.265484
Square до: x=2, y=1, side=3, area=9.0
Square после: x=-8, y=3, side=6, area=36.0
```
