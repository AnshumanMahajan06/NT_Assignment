import { useState } from "react"

export default function StateAndEventHandeling(){
    const [counter,setCounter]=useState(0)
    const[text,setText]=useState("")
    const[visible,setVisible]=useState(true)
    return(
        <>
        <h2>value is: {counter}</h2>
        <button onClick={()=>setCounter(counter+1)}>Increment</button>
        <button onClick={()=>setCounter(counter-1)}>Decrement</button>
        <hr />
        <input type="text" value={text} placeholder="Write something here..." onChange={(event)=>setText(event.target.value)}/>
        <h3>you had written: {text} </h3>
        <hr />

         <h2>Toggle Paragraph</h2>
      <button onClick={() => setVisible(!visible)}>
        {visible ? "Hide" : "Show"} Paragraph
      </button>
      {visible && <p>This is a toggleable paragraph!</p>}
        </>
    )
}