import { useState, useEffect } from 'react';
import axiosInstance from './axios';


const StudentTable = () => {
  const [students, setStudents] = useState([]);

  const fetchData = async () => {
    try {
      const { data: response } = await axiosInstance.get('/students');
      setStudents(response);
    } catch {
      console.log("error");
    }
  };

  useEffect(() => {
    fetchData();
  }, []);

  return (

    <div className="container mt-5">
      <h1>Личные данные учеников</h1>
      <table className="table table-striped table-bordered" style={{ backgroundColor: '#f8f9fa' }}>
        <thead className="thead-dark">
          <tr>
            <th>#</th>
            <th>Имя</th>
            <th>Фамилия</th>
            <th>Возраст</th>
            <th>E-mail</th>
            <th>Телефон</th>
          </tr>
        </thead>
        <tbody>
          {students.length > 0 ? (
            students.map((student, index) => (
              <tr key={student.id}>
                <td>{index + 1}</td>
                <td>{student.name}</td>
                <td>{student.surname}</td>
                <td>{student.age}</td>
                <td>{student.email}</td>
                <th>{student.phone}</th>
              </tr>
            ))
          ) : (
            <tr>
              <td colSpan="6" className="text-center">No data available</td>
            </tr>
          )}
        </tbody>
      </table>
    </div>
  );
};

export default StudentTable;
