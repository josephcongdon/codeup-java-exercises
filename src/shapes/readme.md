### What is an abstract class?

a:
An abstract class is a class that can serve as a superclass, but cannot be directly instantiated.

### What is an interface?

a: An interface is a special case of an abstract class. Interfaces are used to _define_ the behaviour of our object.

interface is an abstract class that follows these rules:

1. all methods are public and abstract.
2. all properties are public static and final.
3. no static methods.

### What can an abstract class do that an interface can’t?
a: 
1. An abstract class can inherit a class and multiple interfaces.
2. An interface cannot declare constructors or destructors. 
3. An abstract class can declare constructors and destructors. It can extend any number of interfaces
### What can an interface do that an abstract class can’t?

### Does the idea of a bicycle match more closely with an abstract class or interface?

### Does the idea of “repairable” (being able to repair something) match more closely with an abstract class or interface?

###What other related examples of abstract classes and interfaces come to mind?


-- NOTES

We will harness the power of inheritance and polymorphsm further in this lesson using more abstraction.

Abstract Class - a more general class meant to be extended by other more specific subclasses
extending from an abstract class is a "type of" relationship

Interface - an aspect of something that may be made a part of another class
implementing an interface is a "can do" or "can be" relationship

Building b = new Library();

Abstract class examples: Building

    Sub-abstract Classes:

        PublicBuilding
            Library
            CivicCenter
            PoliceDepartment
            FireHouse

        PrivateBuilding
            House
            Tent
            Shed
            Theater
            MobileHome

        CommercialBuilding
            StorageShed
            Warehouse
            Factory
            BicycleRepairShop
            GroceryStore


Interface examples:

    ClimateControlled
        adjustHeating()
        adjustInsulation()

    Portable
        getCurrentLocation()
        setNewLocation()
        secureTransport()
        moveToNewLocation()
        setAllRecordsToNewLocation()

    Accessible
        getNewRequirements()
        inspect()
        adjustBathrooms()
        adjustWalkways()
        adjustDoors()

    Serviceable
        installElectricalWiring()
        installPlumbing()
        connectPower()
        disconnectPower()
        turnOnWater()
        turnOffWater()
        makeUtilityPayment()

    Sellable
        getCurrentOwner()
        getOwnerHistory()
        transferDeedOfOwnership()
        buyerBackgroundCheck()
        deriveFairMarketValue()

    Rentable
        getCurrentRenterInfo()
        getRentalHistory()
        addRentalRecord()
        generateRentalContract()
        setRentalRate()
        setListingRentalStatus()

    Maintainable

    Securable


-- More "Real World" Scenerio

class ServerRequests

giveMePosts()
createAPost()
deleteAPost()


Interface CRUDable {
create()
read()
update()
delete()
}

CRUDFactory {
CRUDable c = new MySQLPostsDataAccessObject();
CRUDable getPostsCrudableObject()
return c;
}

abstract class DataAccessObject
connect()
executeTransaction()
disconnect()

class MySQLPostsDataAccessObject extends DataAccessObject implements CRUDable

class MongoDBPostsDataAccessObject extends DataAccessObject implements CRUDable

class MariaDBPostsDataAccessObject extends DataAccessObject implements CRUDable