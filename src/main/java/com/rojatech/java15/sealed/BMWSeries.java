package com.rojatech.java15.sealed;

// enabling more fine-grained inheritance control in java.
// allows classes and interfaces to define their permitted subtypes.
// useful feature for domain modelling and increasing the security of libraries.
public sealed class BMWSeries permits ThreeSeries, FiveSeries {

}
