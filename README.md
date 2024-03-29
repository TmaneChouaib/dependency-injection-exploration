<h2 align="center">DI - IoC Exploration</h2>

## 🔎 Table of Contents :

- [About](#about)
- [Features](#features)
- [Architecture](#architecture)
- [Contacts](#contacts)

## <a name="about"></a> 📎 About :


- 🏋️‍♂️ This lab demonstrates the concepts of <strong>dependency injection (DI)</strong> and <strong>inversion of control (IoC)</strong>
  in Java.It provides both a <strong>static</strong> and dynamic <strong>presentation</strong>
  of how dependencies can be injected into classes.

## <a name="features"></a> 📎 Features :

- <strong>Static Presentation</strong>: Use static instantiation to create instances of <code>DOA</code> and <code>Business</code> implementations and inject dependencies using <code>setter methods</code>.
- <strong>Dynamic Presentation</strong>: Read configuration from a file and dynamically instantiate <code>DAO</code> and <code>Business</code> implementations based on class names specified in the <code>config.txt</code> file.
- <strong>Interface Abstraction</strong>: Define contracts through the <code>IBusiness</code> and <code>IDao</code> interfaces for<strong> loose coupling</strong> and easy swapping of implementations.
- <strong>Multiple Implementations</strong>: Support multiple implementations of <code>IDao</code> and <code>IBusiness</code> interfaces for retrieving data from different sources.
- <strong>File Configuration</strong>: Configure the application behavior by specifying implementations in the configuration file <code>config.txt</code> , allowing for easy modification without code changes.

## <a name="architecture"></a> 📎 Architecture Diagram : (DI/DIP) - Layer Structure :

<p align="center">
<img src="public-doc/IOC.png">
</p>

## <a name="contacts"></a> 📎 Contacts:

- For any inquires or feedback regarding this project, please contact me on: chouaib.tmane@hotmail.com.


<p align="right" style="font-size: x-large; font-weight: bold"> End </p>

----------------------------------------------------------------------------------------------------------

<p align="center">
<img src="public-doc/Brand.png">
</p>