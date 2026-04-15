class Hotel{
    Booking[] bookings =new Booking[10];
    Room[] rooms =new Room[10];
    int bcount=0;
    int rcount=0;
    void addR(int rno,String type){
        rooms[rcount++]=new Room(rno,type);
    }
    void checkAvail(){
        for(int i=0;i<rcount;i++){
            if(rooms[i].isAvail){
                System.out.println("Room number "+rooms[i].roomNumber+" "+rooms[i].type);
            }
        }
    }
    void Book(int rno,String name,String phn){
        int flag=0;
        for(int i=0;i<rcount;i++){
            if(rooms[i].roomNumber==rno && rooms[i].isAvail){
                rooms[i].isAvail=false;
                Customer customer=new Customer(name,phn);
                bookings[bcount++]=new Booking(rooms[i],customer);
                System.out.println("Booking Successfull");
                flag=1;
                break;
            }
        }
        if(flag==0) System.out.println("Not available");
    }
    void Vacate(int rno){
        int f=0;
        for(int i=0;i<bcount;i++){
            if(bookings[i].room.roomNumber==rno){
                bookings[i].room.isAvail=true;
                f=1;
                for(int j=i;j<bcount-1;j++){
                    bookings[j]=bookings[j+1];
                }
                bcount--;
                System.out.println("Done");
            }
        }
        if(f==0) System.out.println("No Previous Bookings");
    }
}
