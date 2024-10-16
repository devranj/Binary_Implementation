public void placeBookOnHold(Borrower bor)
    {
        HoldRequest hr = new HoldRequest(bor,this, new Date());

        holdRequestsOperations.addHoldRequest(hr);        //Add this hold request to holdRequests queue of this book
        bor.addHoldRequest(hr);      //Add this hold request to that particular borrower's class as well
        
        System.out.println("\nThe book " + title + " has been successfully placed on hold by borrower " + bor.getName() + ".\n");
    }
