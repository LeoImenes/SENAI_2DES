import React, {useState} from "react";
import { View,Text,TouchableOpacity,Image} from "react-native";
import styles from './style.js'

export default function App() {
const [value,setValue]= useState("");
const nome = "Fulano da silva";
const star = require('./assets/star.png');

const data = [
    {
        nome:'Reenye lanches',
        nota:6
    },
    {
        nome: 'Minge Aliche',
        nota:4
    },
    {
        nome: 'Tia  betch',
        nota: 3
    },
    {
        nome:'Marchesini',
        nota:2
    }
];

    return ( 
    
    <View style={styles.container}> 
        <Text style={styles.title}>{value}</Text>
        {data.map((restaurante,index) => {
            return(
                <TouchableOpacity key={index} style={styles.card} onPress={() => {setValue(restaurante.nome)}}>
                <Text style={styles.nomeloja}>{restaurante.nome} </Text>
                <View style={styles.nota}>
                <Text style={styles.nomeloja}>{restaurante.nota}</Text>
                <Image source={{uri:'https://cdn.iconscout.com/icon/free/png-256/star-bookmark-favorite-shape-rank-16-28621.png'}}
                style={styles.star}
                >
                </Image>
                </View>
                </TouchableOpacity>
            );
        })}
     
    </View>
    );

    }
