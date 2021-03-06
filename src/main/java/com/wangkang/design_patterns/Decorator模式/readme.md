## 人穿衣服示例
- 人是组件(Component)，衣服是装饰(decorator)
- 使用装饰者模式的话，人穿怎样穿衣服，穿什么样的衣服就很灵活了
- 具体示例略：可参看大话设计模式第6章（装饰者模式）

## JavaIO 示例
- JavaIO 中关键的两个类是 1）InputStream 2）FilterInputStream
- InputStream：抽象的组件类，具体的组件类继承它，来实现不同的输入流功能
- FilterInputStream：抽象装饰者类，具体装饰者类继承它，来对它包装的组件类，进行扩展
- 扩展：JavaIO 可通过添加具体组件类和添加具体装饰者类，来达到扩展 JavaIO 的目的

## 装饰者模式的核心
- 核心：1）组件类 2）装饰者类
- 组件类：定义不同的核心功能（方法）
- 装饰者类：为核心功能（方法）增加额外的小功能
- 比如：IO 的核心功能是读取/输入流；IO的额外功能是：对读取/输入流进行缓冲、编码等