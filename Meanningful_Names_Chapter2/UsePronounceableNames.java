// Bad Code
class DtaRcrd102 {
    private Date genymdhms;
    private Date modymdhms;
    private final String pszqint = "102";
    /* ... */
};
// Good Code
class Customer {
    private Date generationTimestamp; 
    private Date modificationTimestamp;; 
    private final String recordId = "102";
    /* ... */
};
