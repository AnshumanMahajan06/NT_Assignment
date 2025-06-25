import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import UserCart from './UserCart'
import StateAndEventHandeling from './StateAndEventHandeling'
function App() {
  let name="Anshuman";
  let pass="AnshumanMahajan1234";
  let age=22;

  return (
    <>
      <UserCart name={name} pass={pass} age={age}/>
      <hr />
      <StateAndEventHandeling/>
    </>
  )
}

export default App
