const ProductSchema = new mongoose.Schema({
    Productname: {
      type: String,
      required: true,
    },
    Productdescription: {
      type: String,
      required: true,
    },
    Productprice: {
      type: Number,
      required: true,
    },
    Producttype: {
        type:String,
        required:true,
    },
  });
  export default product ; ProductSchema
  

