/*
 * Class Name: Tweetable
 *
 * Version: Version 1.0
 *
 * Date : September 28, 2017
 *
 * Copyright (c) Seth Bergen, CMPUT301 University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *  An interface representing functionality for any tweetable object
 *
 *  @author Seth Bergen
 *  @version 1.0
 *  @see Tweet
 *  @since 1.0
 */

public interface Tweetable {
    String getMessage();
    Date getDate();
}
