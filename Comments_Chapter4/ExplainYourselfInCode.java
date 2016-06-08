// Bad Orginal Code
---
// Check to see if the employee is eligible for full benefits 
if ((employee.flags & HOURLY_FLAG) &&
        (employee.age > 65))
---
// Good Code
if ((employee.isEligibleForFullBenefits())
