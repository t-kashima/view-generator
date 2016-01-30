View Generator
============
This library can easily generate a custom view.

Example
-------

How to generate a custom view.

```java
public class CustomTextView extends TextView {
    @Property
    private String font;

    @Property([BOLD, ITALIC])
    private FontType fontType;
}
```
