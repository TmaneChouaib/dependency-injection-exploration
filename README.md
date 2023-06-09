<h2 align="center">IoC - DI Exploration</h2>

## 🔎 Table of Contents :

- [About](#about)
- [Features](#features)
- [Architecture](#architecture)
- [Contributions](#contributions)

## <a name="about"></a> 📎 About :

<img src="IoC-part-01/public-doc/DI.png" align="right" width="100px">

- 🏋️‍♂️ This lab demonstrates the concepts of <strong>dependency injection</strong> and <strong>inversion of control (IoC)</strong>
in Java.It provides both a <strong>static</strong> and dynamic <strong>presentation</strong> 
of how dependencies can be injected into classes.

## <a name="features"></a> 📎 Features :

- <strong>Dynamic Presentation</strong>: Read configuration from a file and dynamically instantiate <code>DAO</code> and <code>Business</code> implementations based on class names specified in the <code>config.txt</code> file.
- <strong>Static Presentation</strong>: Use static instantiation to create instances of <code>DOA</code> and <code>Business</code> implementations and inject dependencies using <code>setter methods</code>.
- <strong>Interface Abstraction</strong>: Define contracts through the <code>IBusiness</code> and <code>IDao</code> interfaces for<strong> loose coupling</strong> and easy swapping of implementations.
- <strong>Multiple Implementations</strong>: Support multiple implementations of <code>IDao</code> and <code>IBusiness</code> interfaces for retrieving data from different sources.
- <strong>File Configuration</strong>: Configure the application behavior by specifying implementations in the configuration file <code>config.txt</code> , allowing for easy modification without code changes.

## <a name="architecture"></a> 📎 Architecture Diagram : (DI) - Layer Structure :

<p align="center">
<img src="IoC-part-01/public-doc/IoC.png">
</p>

## <a name="contributions"></a> 📎 Contributions :

Contributions to this repository are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

### End

----------------------------------------------------------------------------------------------------------

<p align="right">Author: 🎬 Tmane Chouaib</p>