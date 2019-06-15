package com.street35.booked.db.entity;

//TODO : Can be incorporated in BookEntity Class
public enum BookCondition {
    FINE, //No defects, little usage
    VERY_GOOD, //No defects, little usage
    GOOD, //The average used book with all pages present
    FAIR, //Well-worn and handled but no text pages are missing
    POOR //All text is legible but may be soiled and have binding defects
}
