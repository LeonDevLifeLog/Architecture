# Architecture
Android平台化/组件化架构

#### 核心依赖
* WmRouter（路由功能，业务组件间代码隔离，利用此来相互调用）
* AppInit (防止各业务组件相关application初始化工作把platform层的application搞乱，把各业务的初始化工作进行隔离)

#### 架构设计如下图

![arch](arch.png)
