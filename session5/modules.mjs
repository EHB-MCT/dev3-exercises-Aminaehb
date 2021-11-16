import * as fs from 'fs/promises';


try {
    let result = await fs.readFile('boardgames.json');
    console.log(result);
    let data = JSON.parse(result);
    console.log(data);
} catch (error) {
    console.log(error);
}