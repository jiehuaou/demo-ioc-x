# What Is Inversion of Control

Inversion of Control is a principle to transfers control of object and their dependencies from the main program to a container or framework. 

* decoupling the execution of a task from its implementation
* making it easier to switch between different implementations
* greater ease in testing a program by isolating a component or mocking its dependencies, 

# What Is Dependency Injection?

Dependency injection is a pattern we can use to implement IoC, 

Connecting objects with other objects, or “injecting” objects into other objects, is done by container rather than by the objects themselves.

# circular-dependency solution

## Autowired by method

```java
   
   private ComponentY y;
   
   @Autowired
   public void config(ComponentY y){
       this.y = y;
   }

```

## inject itself into other by PostConstruct 

```java
    
    @Autowired
    private ComponentZ z;

    @PostConstruct
    public void init(){
        z.config(this);
    }

```

## constructor with @Lazy argument

```java
    private ComponentY y;
    
    public ComponentZ(@Lazy ComponentY y) {
        System.out.println("ComponentZ ... constructed");
        System.out.println("@Lazy ComponentY into Z " + y.getClass().toString());
        this.y = y;
    }
```

