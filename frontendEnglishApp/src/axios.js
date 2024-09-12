import axios from "axios";
const BASE_URL = 'http://localhost:8100';

const axiosInstance = axios.create({
    baseURL: BASE_URL,
    timeout: 20000,
    headers: {
        'Content-Type': 'application/json;charset=utf-8'
    }
});

export default axiosInstance;