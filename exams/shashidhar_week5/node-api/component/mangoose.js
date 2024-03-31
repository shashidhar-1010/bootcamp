import { connect } from 'mongoose';

const connectDataBase = async () => {
  try {
    await connect('mongodb://localhost:27017/node-api', {
      useNewUrlParser: true,
      useUnifiedTopology: true,
    });
    console.log('connected to MongoDB');
  } catch (error) {
    console.error('Not Able to connect to MongoDB', error);
    process.exit(1);
  }
};

export default connectDataBase;