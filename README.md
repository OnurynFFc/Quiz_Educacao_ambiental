# Quiz_Educacao_ambiental
Um quiz utilizando linguagem Java, para a aplicação de conceitos de programação orientada a objeto.

1 - INTRODUÇÃO 

Com a crescente necessidade de promover a conscientização ambiental nas novas gerações motiva o uso de ferramentas tecnológicas como meio de educação. Neste contexto, foi desenvolvido um sistema de quiz utilizando a linguagem de programação Java com foco em educação ambiental, aplicando os princípios da programação orientada a objetos. A proposta consiste em proporcionar uma experiência interativa e pedagógica, que estimule o aprendizado de forma lúdica, ao mesmo tempo em que reforça práticas sustentáveis e conhecimentos sobre o meio ambiente.

O quiz tem como objetivo principal chamar a atenção no aprendizado sobre temas relacionados a educação ambiental e meio ambiente, como reciclagem, preservação dos recursos naturais, mudanças climáticas e sustentabilidade. Por meio de perguntas de múltipla escolha, os usuários são estimulados a testar seus conhecimentos de forma dinâmica e educativa.

Esse tema visa não só informar, mas que ensinar as pessoas a serem mais presentes, capazes de entender as dificuldades nas questões ambientais e assim agindo com mais responsabilidade. A educação ambiental permite que a relação entre os humanos e a natureza seja forte, incentivando na construção de uma sociedade mais sustentável.

Durante todo o desenvolvimento do projeto, foram aplicados conceitos fundamentais da orientação a objetos, como encapsulamento, herança e polimorfismo, garantindo um software bem organizada. Este documento detalha as etapas de criação do sistema e suas funcionalidades.

O principal objetivo deste projeto é desenvolver um software educativo que auxilie na disseminação de conhecimentos sobre educação ambiental por meio de uma ferramenta interativa. O sistema visa estimular o interesse dos usuários por temas ambientais de forma lúdica, reforçar conceitos importantes como reciclagem, sustentabilidade, biodiversidade e preservação dos recursos naturais, aplicar os conceitos de programação orientada a objetos na prática, por meio de um projeto funcional e proporcionar uma interface simples e acessível para facilitar o seu uso.


2- REFERENCIAL TEÓRICO

A pesquisa tem como objetivo servir como base para o desenvolvimento do Quiz a respeito sobre temas de educação ambiental.

A educação ambiental é um processo contínuo que tende a desenvolver nas pessoas uma consciência e preocupação com o meio ambiente e seus problemas associados. No Brasil, a Política Nacional de Educação Ambiental (Lei nº 9.795/1999) foi uma forma de inserir a educação ambiental em todos os níveis e modalidades da educação. 

Esse tema visa não só informar, mas que ensinar as pessoas a serem mais presentes, capazes de entender as dificuldades nas questões ambientais e assim agindo com mais responsabilidade. A educação ambiental permite que a relação entre os humanos e a natureza seja forte, incentivando na construção de uma sociedade mais sustentável. 

Sobre consumo consciente de água destaca a importância de utilizar esse recurso de forma racional, evitando desperdícios e contaminações. A prática envolve mudanças nos hábitos diários, como fechar a torneira ao escovar os dentes, tomar banhos mais curtos e reutilizar a água sempre que possível. A conscientização sobre o uso da água é essencial para garantir a disponibilidade desse recurso para as futuras gerações e para promover a sustentabilidade ambiental. Além disso, o texto enfatiza que pequenas ações individuais podem ter um grande impacto coletivo na preservação da água.

O aquecimento global configura-se como um dos principais desafios ambientais contemporâneos, caracterizado pelo aumento progressivo da temperatura média do planeta devido à intensificação do efeito estufa. Essa intensificação resulta, sobretudo, da emissão crescente de gases como o dióxido de carbono (CO₂), metano (CH₄) e óxidos de nitrogênio (NOₓ), oriundos da queima de combustíveis fósseis, do desmatamento e de práticas agropecuárias intensivas. O enfrentamento dessa crise climática demanda ações coordenadas em escala global, incluindo a transição para fontes de energia renováveis, a adoção de tecnologias de baixo carbono, políticas de reflorestamento e conservação ambiental, além da implementação de mecanismos legais e econômicos que incentivem a redução de emissões. Instrumentos como o Acordo de Paris têm desempenhado papel central na articulação de metas internacionais de mitigação. A participação da sociedade civil, somada a ações educativas e à conscientização ambiental, constitui elemento fundamental para a construção de uma sociedade comprometida com a sustentabilidade e com a preservação das condições climáticas do planeta.

O uso de tecnologias educacionais, como jogos e quizzes, tem se mostrado uma estratégia eficaz para engajar alunos em temas ambientais. Por meio da gamificação, é possível reforçar o aprendizado de forma divertida, promovendo o envolvimento ativo do estudante com os conteúdos propostos.

A escolha de Aplicativo “Quiz”, vem por ser uma maneira mais fácil de chamar a atenção para um assunto tão importante atualmente. Com o crescimento de tecnologias inovadoras a solução de usar um quiz, onde o objetivo é obter uma pontuação com o máximo de acertos possíveis, para obter os olhos da população em um tema de extrema importância acaba sendo o essencial.

A programação orientada a objetos é um paradigma que organiza o software em torno de "objetos", entidades que combinam dados e comportamentos. Os principais pilares da POO — encapsulamento, herança, abstração e polimorfismo — favorecem o desenvolvimento de sistemas mais organizados, reutilizáveis e de fácil manutenção.



3 - DESENVOLVIMENTO 

Através de várias reuniões com o grupo, foram definidos diversos itens para o desenvolvimento do software, definição de atividades, etapas de desenvolvimento, pesquisas sobre o tema proposto.

Na primeira reunião do grupo foi definido qual software seria desenvolvido, levando em conta que teria que ser utilizado obrigatoriamente conceitos de programação orientada a objeto, foram discutidas qual seria melhor opção a ser desenvolvida.

A proposta do grupo foi desenvolver um quiz digital que promovesse o aprendizado de forma lúdica, com conteúdo focado em práticas sustentáveis, recursos naturais e ações ecológicas. A escolha de um quiz com interface gráfica permitiu criar uma experiência mais acessível e atraente, especialmente para o público estudantil.

Durante essa etapa, também foram analisadas soluções similares já existentes, visando saber as boas práticas e as limitações que não iriam ser feitas. Ficou claro que a simplicidade da interação e a objetividade das perguntas seriam essenciais para o objetivo da aplicação.

O Quiz foi escolhido como a melhor opção, já que com a crescente necessidade de conscientização ambiental entre as pessoas, motivou o desenvolvimento de uma ferramenta didática e interativa. O problema identificado foi a dificuldade de engajar o público em atividades educativas sobre meio ambiente utilizando métodos tradicionais.

Após a definição do problema, foram debatidos, com grupo, alguns dos requisitos funcionais e não funcionais do sistema, como por exemplo:

Nos requisitos funcionais:
•	- Exibir perguntas de múltipla escolha sobre educação ambiental.
•	- Permitir seleção de uma alternativa por questão.
•	- Avaliar automaticamente a resposta do usuário.
•	- Apresentar a pontuação final ao término do quiz.
•	- Utilizar um cronômetro regressivo para cada pergunta.
•	- Oferecer opção de reiniciar o quiz.

Nos requisitos não funcionais:
•	- Interface gráfica com uso da biblioteca Java Swing.
•	- Código estruturado com princípios da orientação a objetos.
•	- Boa usabilidade e feedback visual ao usuário (cores e mensagens).
•	- Desempenho fluido sem travamentos ou atrasos.
Essas são as funcionalidades principais definidas para o Software.

O sistema foi estruturado em três classes principais:
•	- Pergunta: encapsula o enunciado, as opções de resposta e a posição da resposta correta.
•	- Quiz: gerencia a lista de perguntas, controle da pontuação e lógica de progresso do quiz.
•	- QuizApp: representa a interface gráfica da aplicação, integrando os componentes visuais com a lógica do quiz.

Com essa divisão o grupo decidiu por usar um modelo de arquitetura de software bem utilizado o MVC(Model-View-Controler), onde há uma possibilidade de separar de forma clara a persistência dos dados, como funcionaria a lógica do software e como seria a interface gráfica do sistema para sua interação com o usuário.

O sistema foi desenvolvido utilizando Java e a biblioteca Swing para a interface gráfica. As perguntas foram inseridas diretamente no código-fonte, com cinco questões de múltipla escolha sobre educação ambiental.

Na interface, o software exibe cada pergunta com quatro opções. O usuário tem até 30 segundos para responder, visualizando esse tempo por meio de um cronômetro e uma barra de progresso. A resposta é avaliada automaticamente, e a cor de fundo muda conforme a correção, com uma mensagem indicando a resposta correta em caso de erro.


Foram adicionados elementos gráficos que tornam a experiência mais agradável, como a personalização de fontes, cores e espaçamento. Também foram considerados aspectos de acessibilidade e clareza visual, com o uso de fontes legíveis e contraste adequado.


4 - RELACIONAMENTO ENTRE DISCIPLINAS (2 PÁGINAS)

O desenvolvimento deste projeto envolveu a aplicação de conhecimentos adquiridos em diversas disciplinas do curso, contribuindo de forma integrada para a elaboração da solução:
•	Programação Orientada a Objetos (POO): base para a estruturação do código, definição das classes e organização lógica do sistema;
•	Interface Homem-Computador (IHC): orientou o design da interface gráfica, usabilidade, acessibilidade e interação com o usuário;
•	Educação Ambiental: fundamentou o conteúdo pedagógico das perguntas, garantindo coerência com os objetivos de conscientização ecológica;
•	Lógica de Programação: sustentou a construção dos algoritmos de avaliação, controle de fluxo e validação de respostas;
Essa convergência de disciplinas mostra como o projeto atuou de forma multidisciplinar, promovendo o desenvolvimento de competências técnicas e pedagógicas ao mesmo tempo.


5 - RESULTADOS E DISCUSSÃO 

Com algumas versões até que se determinasse a versão definitiva. Onde o sistema foi testado em diferentes cenários, simulando erros do usuário (resposta errada, não selecionar opção), tempo esgotado e reinício do quiz. O comportamento esperado foi confirmado em todos os casos:
Para garantir a eficiência da solução e validar as técnicas implementadas, foram elaborados diversos testes que cobrem os principais fluxos do sistema. Entre os cenários testados, foram bem observados:
•	Verificação da lógica de avaliação automática de respostas corretas e incorretas;
•	Avaliação da resposta padrão em caso de tempo esgotado;
•	Testes de reinício do quiz sem falhas na lógica interna;
•	Comportamento da barra de progresso e temporizador entre questões;
•	Feedback visual após cada resposta (cores e mensagens);
•	Robustez do sistema ao manipular várias execuções seguidas.

Esses testes demonstraram que o sistema é estável, com desempenho consistente mesmo após múltiplas execuções, e que todos os requisitos funcionais foram corretamente implementados. A estrutura orientada a objetos também facilitou a identificação de erros e a manutenção do código durante a fase de testes.
Além disso, foram realizados testes com usuários os membros do grupo e outros usuários reais, que fizeram uma boa avaliação das perguntas, o tempo para resposta e o feedback visual recebido após cada tentativa.

Através dos testes realizados, foi possível comprovar a eficiência da abordagem orientada a objetos na organização e manutenção do código. A modularidade permitiu ajustes rápidos durante os testes e facilitou a validação individual de cada componente. Além disso, a estratégia de gamificação adotada se mostrou eficaz para engajar os usuários no aprendizado ambiental, reforçando o objetivo pedagógico do projeto.

Em resumo, o código do quiz educacional demonstra de forma clara e prática como a Programação Orientada a Objetos pode ser aplicada para organizar um projeto, separar responsabilidades, proteger dados e facilitar a expansão e manutenção do sistema. É um ótimo exemplo de como estruturar uma aplicação real seguindo os princípios da POO


6 - CONSIDERAÇÕES FINAIS 

O desenvolvimento do sistema “quiz educação ambiental” demonstrou como a tecnologia pode ser uma aliada no processo de ensino e aprendizagem, especialmente em temas relevantes como a sustentabilidade e a preservação do meio ambiente.

A utilização da linguagem Java em conjunto com o paradigma da orientação a objetos permitiu a construção de um sistema bem estruturado, com código modular e de fácil manutenção. Do ponto de vista analista, o quiz se mostrou eficaz na fixação de conteúdos relacionados à educação ambiental.

O projeto abre possibilidades para futuras melhorias, como integração com banco de dados, inserção dinâmica de novas perguntas, implementação de níveis de dificuldade, personalização por perfis de usuário e publicação como aplicativo educacional. O grupo considera que o sistema desenvolvido cumpre com os objetivos propostos e representa uma sólida aplicação prática dos conhecimentos adquiridos.



7 - REFERÊNCIAS BIBLIOGRÁFICAS

 BRASIL. Lei nº 9.795, de 27 de abril de 1999. Dispõe sobre a educação ambiental, institui a Política Nacional de Educação Ambiental e dá outras providências. Disponível em: http://www.planalto.gov.br/ccivil_03/leis/l9795.htm. Acesso em: 25 abr. 2025.
COSTA, L. C. et al. A educação ambiental como estratégia de mobilização social para o enfrentamento da escassez de água. SciELO Brasil. Disponível em: https://www.scielo.br/. Acesso em: 25 abr. 2025.
CIDESP. Cidadania e meio ambiente: práticas para um futuro sustentável. Disponível em: https://www.cidesp.sp.gov.br/. Acesso em: 25 abr. 2025.
JORNADA VERDE. Guia prático de educação ambiental para sustentabilidade no Brasil. Disponível em: https://www.jornadaverde.org.br/. Acesso em: 26 abr. 2025.
NOVA ESCOLA. Educação ambiental: como usar o cotidiano dos alunos para ensinar sobre energia. Disponível em: https://novaescola.org.br/. Acesso em: 26 abr. 2025.
INTERGOVERNMENTAL PANEL ON CLIMATE CHANGE (IPCC). Climate Change 2023: Synthesis Report. Geneva: IPCC, 2023. Disponível em: https://www.ipcc.ch/report/ar6/syr/. Acesso em: 2 maio 2025.
PAULIUK, Stefan; HERTWICH, Edgar G. Socioeconomic metabolism and climate change. In: ROSENZWEIG, Cynthia et al. (Ed.). Climate Change 2022: Mitigation of Climate Change. Contribution of Working Group III to the Sixth Assessment Report of the Intergovernmental Panel on Climate Change. Cambridge: Cambridge University Press, 2022.
BRASIL. Ministério do Meio Ambiente. Plano Nacional sobre Mudança do Clima: PNMC – Política e Plano. Brasília: MMA, 2020. Disponível em: https://www.gov.br/mma/pt-br. Acesso em: 2 maio 2025.
PADRÃO, Lucas Nogueira. Análise e projeto de sistemas. Viena: Viena, 2025.

