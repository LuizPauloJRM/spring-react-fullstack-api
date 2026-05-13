import { useState } from 'react' 4.1k {gzipped: 1.8k}
import './App.css'
function App(){
    const data: FoodData[] = [];


  return (
      <div className="container">
        <h1>Cardápio</h1>
         <div className="card-grid">
             {data.map(foodData => <Card price = {foodData.price} title={foodData.title} image={foodData.image}/>)}
         </div>
      </div>
  )
}

export default App
