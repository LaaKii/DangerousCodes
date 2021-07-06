# DangerousCodes

Contains Dangerous Code parts in Java, which I experienced in production code or read about (most of them are from "Effective Java" by Joshua Bloch)

## Dangerous parts
<ul>
  <li>Overriding Method which are called in Superclass. (Inheritance package)</li> 
    <ul>
      <li>If you override a method which is called in the super constructor, the super constructor will call the sub method. This can lead to unexpected behavior. This behavior can occur, if you coincidentally name a method the same it is called in the super class</li>
    </ul>
  <li>...</li>
</ul>
