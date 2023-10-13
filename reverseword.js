function reverseWordsInSentence(sentence) {
    // Split the sentence into words based on whitespace
    const words = sentence.split(' ');

    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words back together to form the reversed sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

const inputSentence = 'This is a sunny day'; // Replace with your input sentence
const reversedSentence = reverseWordsInSentence(inputSentence);

console.log('Original sentence: ' + inputSentence);
console.log('Reversed sentence: ' + reversedSentence);
