import axios from 'axios'

const BASE_URL = "http://localhost:8080/api/v1"
const RegisterForm = () => {
    const [formData, setFormData] = useState({
        userName: "",
        fullName: "",
        emailAddress: "",
        phoneNumber: ""
    })

    const handleRegistration = () => {
        axios.post(`${BASE_URL}/register`, formData)
            .then(res => {
                console.log(res.data);
            })
            .catch(err => {
                console.log(err)
            })
    }

    const setFullName = (e) => setFormData({..., fullName: e.target.value })
    const setUsername = (e) => setFormData({..., userName: e.target.value })
    const setEmailAddress = (e) => setFormData({..., emailAddress: e.target.value })
    const setPhoneNumber = (e) => setFormData({..., phoneNumber: e.target.value })




    return (
        <section>
            <form>
                <label>Username
                <input type="text" onChange={setUsername}/>
                </label>
                <label>FullName
                <input type="text" onChange={setFullName}/>
                </label>
                <label>Email Address
                <input type="email" onChange={setEmailAddress}/>
                </label>
                <label>Phone Number
                <input type="number" onChange={setPhoneNumber}/>
                </label>
                <button type={"submit"} onClick={handleRegistration}>REGISTER</button>
            </form>
        </section>
    )
}

export default RegisterForm;