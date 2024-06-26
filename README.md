<h2 align="center">DI - IoC Demo</h2>

## 🔎 Table of Contents :

- [About](#about)
- [Features](#features)
- [Class Diagram](#class-diagram)
- [Project Structure](#project-structure)
- [Contacts](#contacts)

## <a name="about"></a> 📎 About :

- 🏋️‍♂️ This lab demonstrates the concepts of <strong>dependency injection (DI)</strong> and <strong>inversion of
  control (IoC)</strong>
  in Java. It provides both a <strong>static</strong> and dynamic <strong>presentation</strong> of how dependencies can
  be injected into classes.

## <a name="features"></a> 📎 Features :

- <strong>Static Presentation</strong>: Use static instantiation to create instances of DOA and 
  Business implementations and inject dependencies using setter methods.
- <strong>Dynamic Presentation</strong>: Read configuration from a file and dynamically instantiate DAO
  and Business implementations based on class names specified in the config.txt file.
- <strong>Interface Abstraction</strong>: Define contracts through the IBusiness and IDao
  interfaces for<strong> loose coupling
  </strong> and easy swapping of implementations.
- <strong>Multiple Implementations</strong>: Support multiple implementations of IDao and 
  IBusiness interfaces for retrieving data from different sources.
- <strong>File Configuration</strong>: Configure the application behavior by specifying implementations in the
  configuration file config.txt, allowing for easy modification without code changes.

### <a name="class-diagram"></a>📎  Class Diagram : (DI/DIP) - Layer Structure :

<p align="center">
<img src="public-doc/IoC.jpg">
</p>

## <a name="project-structure"></a> 📎 Project Structure:

```
dependency-injection-demo/
│
├── src/
│   ├── business/
│   │   ├── IBusiness.java
│   │   └── BusinessImpl.java
│   │
│   ├── dao/
│   │   ├── IDao.java
│   │   └── DaoImpl_A.java
│   │
│   ├── extension/
│   │   ├── DaoImpl_B.java
│   │   └── DaoImpl_C.java
│   │
│   ├── presentation/
│   │   ├── DynamicPresentation.java
│   │   └── StaticPresentation.java
│   │
│   └── Main.java
│
├── config.txt
└── README.md
```

## <a name="contacts"></a> 📎 Contacts:

- For any inquires or feedback regarding this project, please contact me on: chouaib.tmane@hotmail.com.

<p align="right" style="font-size: x-large; font-weight: bold"> End </p>

---

<p align="end">
Author: Tmane Chouaib
</p>
