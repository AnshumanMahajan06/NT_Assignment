function UserCart({name,pass,age}){

    function UserDetails(){
        return(
            <>
            <h3>User name is: {name}</h3>
            <h3>User password is: {pass}</h3>
            <h3>User age is: {age}</h3>
            </>
        )
    }
    return(
        <div>
            <h2>User Details are:</h2>
            
            <UserDetails/>
        </div>

    )
}
export default UserCart;