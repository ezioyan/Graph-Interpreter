# Graph-Interpreter 函数绘图语言解释器

**基于antlr4构造函数绘图语言的词法分析器和语法分析器，并进行语义计算和绘图。**

### 环境配置


1. 准备好 JAVA,  IntelliJ IDEA
2. 从[Antlr4 官网](http://www.antlr.org/tools.html)下载 jar 包，并[导入到IDEA](https://www.jianshu.com/p/56b11f36df0c)
3. IDEA -> File -> Settings -> Plugins 安装 ANTLR v4 grammar plugin

### 函数绘图语言


对大小写不敏感

支持的运算符和分隔符：+  -  /  *  **  ;  (  )  ,

支持的数值类型：整数，实数和命名常数(pi和e)

支持的语句：

- Origin语句：设定初始坐标

- Scale语句：设定缩放比例

- Rot语句：设定旋转角度

- For语句：绘图操作

- Color语句：设定颜色

函数绘图语言示例：

```python
ORIGIN IS (20,200);
rot IS 0;
SCALE IS(40,40);
FOR T FROM 0 TO 2*PI+PI/50 STEP PI/50 DRAW(T, sin(T));
Color is Green;
ORIGIN IS (20,240);
FOR T FROM 0 TO 2*PI+PI/50 STEP PI/50 DRAW(T, sin(T));
color is BLUE;
ORIGIN IS (20,280);
FOR T FROM 0 TO 2*PI+PI/50 STEP PI/50 DRAW(T, sin(T));
```



