import { useEffect, useState } from "react";
import axios from 'axios'

const BASE_URL = "http://localhost:8080/api/v1"
const Table = () => {
    const[users, setUsers] = useState([])

    useEffect(() => {
        axios.get(`${BASE_URL}/users`)
            .then(res => {
                const data = res.data;
                setUsers(data)
                console.log(data)
            }).catch(err => {
                console.log(err)
        })
    }, [])
    
    
    return (
        <section>
            <table>
                <thead>
                    <tr>
                        <th>Username</th>
                        <th>FullName</th>
                        <th>Email Address</th>
                        <th>Phone Number</th>
                    </tr>
                </thead>
                <tbody>

                {
                    users.map((user, index) => {
                        const { userName, fullName, emailAddress, phoneNumber } = user
                        return (
                            <tr key={ index }>
                                <td>{ userName }</td>
                                <td>{ fullName }</td>
                                <td>{ emailAddress }</td>
                                <td>{ phoneNumber }</td>
                            </tr>
                            )
                        }
                    )
                }
                </tbody>
            </table>
        </section>
    )
}

export default Table;