
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

