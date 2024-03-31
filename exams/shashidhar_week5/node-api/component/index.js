import express from 'express';
import { json } from 'body-parser';
import connectDataBase from './db';
import Product, { find } from './product';

const app = express();
app.use(json());

connectDataBase();

app.post('/api/products', async (req, res) => {
  const { Productname, Productdescription, Productprice,Producttype } = req.body;

  try {
    const newProduct = new Product({ Productname, Productdescription, Productprice, Producttype });
    const product = await newProduct.save();
    res.json(product);
  } catch (error) {
    res.status(500).send('unable to post the product');
  }
});

app.get('/api/products', async (req, res) => {
  try {
    const products = await find();
    res.json(products);
  } catch (error) {
    res.status(500).send('unable to get the product');
  }
});

const PORT = process.env.PORT || 8080;
app.listen(PORT, () => console.log(`"port which is in use was": ${PORT}`))