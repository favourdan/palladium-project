import axios from 'axios'
import { useState } from 'react'

const BASE_URL = "http://localhost:8080/api/v1"
const RegisterForm = () => {
    const [username, setUsername] = useState("")
    const [fullName, setFullName] = useState("")

    const [emailAddress, setEmailAddress] = useState("")

    const [phoneNumber, setPhoneNumber] = useState("")


    const handleRegistration = () => {
        axios.post(`${BASE_URL}/register`, {
            userName: userName,
            fullName: fullName,
            emailAddress: emailAddress,
            phoneNumber: phoneNumber
        })
            .then(res => {
                console.log(res.data);
            })
            .catch(err => {
                console.log(err)
            })
    }

    const handleSetFullName = (e) => setFullName(e.target.value)
    const handleSetUsername = (e) => setUsername(e.target.value)
    const handleSetEmailAddress = (e) => setEmailAddress(e.target.value)
    const handleSetPhoneNumber = (e) => setPhoneNumber(e.target.value)




    return (
        <section>
            <form>
                <label>Username
                <input type="text" onChange={handleSetUsername}/>
                </label>
                <label>FullName
                <input type="text" onChange={handleSetFullName}/>
                </label>
                <label>Email Address
                <input type="email" onChange={handleSetEmailAddress}/>
                </label>
                <label>Phone Number
                <input type="number" onChange={handleSetPhoneNumber}/>
                </label>
                <button type={"submit"} onClick={handleRegistration}>REGISTER</button>
            </form>
        </section>
    )
}

export default RegisterForm;