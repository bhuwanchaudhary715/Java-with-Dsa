package items;

/*
       Single Responsibility Principle

 */

import main.LateFeeCalculatable;

public interface LibraryItem extends LateFeeCalculatable {

    String getTitle();
    String getUniqueId();

    double  getValue();
}
