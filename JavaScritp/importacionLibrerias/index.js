//La libreria Chalk hace cambiar de color los datos de salida
import { suma, multip } from "./controller.js";
import chalk from "chalk";

const sum = suma(1,2)
console.log(chalk.green(sum))

const multi = multip(4,5)
console.log(chalk.green(multi))


console.log(chalk.blue('Hello world!'));
