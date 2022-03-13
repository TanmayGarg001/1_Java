package com.company;

public class Main {

    public static void main(String[] args) {

    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        return (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) ? -1
                : (int) Math.ceil((width * height - (areaPerBucket * extraBuckets)) / areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return (width <= 0 || height <= 0 || areaPerBucket <= 0) ? -1 : (int) Math.ceil((width * height) / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return (area <= 0 || areaPerBucket <= 0) ? -1 : (int) Math.ceil(area / areaPerBucket);
    }
}










































