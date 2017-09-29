/*
 * Class Name: ImportantTweet
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
 *  Represents an ImportantTweet
 *
 *  @author Seth Bergen
 *  @version 1.0
 *  @see Tweet
 *  @see NormalTweet
 *  @since 1.0
 */

public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * Constructs ImportantTweet objects
     *
     * @param message tweet message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs ImportantTweet objects
     *
     * @param message tweet message
     * @param date tweet date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Returns a boolean value. True if the tweet is important, else false.
     *
     * @return Boolean
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
